package com.ait.sad.model;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MemoFactory {

	public Memo makeMemo(MemoMap memoMap) {
		Date dateRemind = null;
		if (memoMap.dateRemind != null || memoMap.dateRemind.isEmpty());
			dateRemind = getSqlDate(memoMap.dateRemind, "MM/dd/yyyy");

		Memo memo = new MemoBuilder().setName(memoMap.name).setTopic(memoMap.topic).setDetail(memoMap.detail)
				.setDateCreate(new java.sql.Date(Calendar.getInstance().getTimeInMillis())).setDateUpdate(null)
				.setDateRemind(dateRemind).build();
		return memo;
	}

	private Date getSqlDate(String dateStr, String format) {

		// String startDate="12-31-2014";
		// SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd-yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat(format);
		java.util.Date date;
		try {
			date = sdf1.parse(dateStr);
			java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
			return sqlStartDate;

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
