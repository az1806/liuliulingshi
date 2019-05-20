package com.lingshi.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lingshi.da.ProductTypeDao;
import com.lingshi.entity.ProductType;
import com.lingshi.util.DBManager;


public class ProductTyoeDaoImpl implements ProductTypeDao{

	public List<ProductType> queryProductTypes() {
		List<ProductType> pts = new ArrayList<ProductType>();
		ResultSet rs = DBManager.querySQL("select * from leibei ;");
		try {
			while (rs.next()) {
				ProductType pt = new ProductType();

				pt.setId(rs.getInt(1));
				pt.setName(rs.getString(2));
				pts.add(pt);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pts;
	}

}
