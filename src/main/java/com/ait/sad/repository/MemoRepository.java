package com.ait.sad.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ait.sad.DbManager;
import com.ait.sad.model.Memo;

public class MemoRepository {

	public MemoRepository() {

	}

	public void save(Memo memo) {

		DbManager db = new DbManager();
		Connection conn = db.getConnection();

		PreparedStatement stat;
		try {
			conn = new DbManager().getConnection();

			stat = conn.prepareStatement(
					"insert into memo( name,topic, detail,  dateCreate,dateUpdate,dateRemind) values (?, ?, ?, ?,?,?)");

			stat.setString(1, memo.getName());
			stat.setString(2, memo.getTopic());
			stat.setString(3, memo.getDetail());
			stat.setDate(4, memo.getDateCreate());
			stat.setDate(5, memo.getDateUpdate());
			stat.setDate(6, memo.getDateRemind());

			stat.executeUpdate();

			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.close();

		}

	}

	public Memo findOneById(int id) {
		PreparedStatement ps = null;
		ResultSet rs = null;

		DbManager db = new DbManager();
		Connection conn = db.getConnection();

		try {
			ps = conn.prepareStatement("select topic, detail,  dateCreate, dateUpdate from memo where id =?  limit 1");
			ps.setInt(1, id);

			rs = ps.executeQuery();

			if (rs != null && rs.next()) {

				Memo memo = new Memo();
				memo.setTopic(rs.getString("topic"));
				memo.setDetail(rs.getString("detail"));

				// memo.setDateCreate(rs.getDate("dateCreate"));
				// memo.setDateUpdate(rs.getDate("dateUpdate"));
				conn.close();
				return memo;

			} else {
				conn.close();
				return null;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.close();
		}
		return null;
	}

	public ArrayList<Memo> findAll() {
		PreparedStatement ps = null;
		ResultSet rs = null;

		DbManager db = new DbManager();
		Connection conn = db.getConnection();

		ArrayList<Memo> memoList = new ArrayList<Memo>();

		try {
			ps = conn.prepareStatement("select topic, name, detail,  dateCreate, dateUpdate,dateRemind from memo");

			rs = ps.executeQuery();

			System.out.println("111111111111");
			while (rs.next()) {

				Memo memo = new Memo();

				memo.setTopic(rs.getString("topic"));
				memo.setDetail(rs.getString("detail"));
				memo.setName(rs.getString("name"));
				// System.out.println(">>>>> "+rs.getDate("dateCreate").getTime());
				if (rs.getDate("dateCreate") != null)
					memo.setDateCreate(rs.getDate("dateCreate"));
				if (rs.getDate("dateUpdate") != null)
					memo.setDateUpdate(rs.getDate("dateUpdate"));
				if (rs.getDate("dateRemind") != null)
					memo.setDateRemind(rs.getDate("dateRemind"));
				
				memoList.add(memo);

			}
			System.out.println("2222222222");

			conn.close();
			return memoList;

		} catch (

		SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.close();
		}
		return null;
	}
}
