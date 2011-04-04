/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.knowledgebase.hook.upgrade.v1_1_0;

import com.liferay.portal.kernel.dao.jdbc.DataAccess;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.upgrade.UpgradeProcess;
import com.liferay.portal.kernel.util.StringBundler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author Peter Shin
 */
public class UpgradeClassName extends UpgradeProcess {

	protected void doUpgrade() throws Exception {
		long classNameId = getClassNameId(_ARTICLE_CLASS_NAME);

		if (classNameId == 0) {
			return;
		}

		updateClassName(_KB_ARTICLE_CLASS_NAME, _ARTICLE_CLASS_NAME);
		updateClassName(_KB_COMMENT_CLASS_NAME, _COMMENT_CLASS_NAME);
		updateClassName(_KB_TEMPLATE_CLASS_NAME, _TEMPLATE_CLASS_NAME);
	}

	protected long getClassNameId(String className) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = DataAccess.getConnection();

			String sql = "select classNameId from ClassName_ where value = ?";

			ps = con.prepareStatement(sql);

			ps.setString(1, className);

			rs = ps.executeQuery();

			if (rs.next()) {
				return rs.getLong("classNameId");
			}

			return 0;
		}
		finally {
			DataAccess.cleanUp(con, ps, rs);
		}
	}

	protected void updateClassName(String newClassName, String oldClassName)
		throws Exception {

		long newClassNameId = getClassNameId(newClassName);
		long oldClassNameId = getClassNameId(oldClassName);

		StringBundler sb = new StringBundler(3);

		sb.append("delete from ClassName_ where classNameId = '");
		sb.append(newClassNameId);
		sb.append("'");

		if (_log.isDebugEnabled()) {
			_log.debug(sb.toString());
		}

		runSQL(sb.toString());

		sb = new StringBundler(5);

		sb.append("update ClassName_ set value = '");
		sb.append(newClassName);
		sb.append("' where classNameId = '");
		sb.append(oldClassNameId);
		sb.append("'");

		if (_log.isDebugEnabled()) {
			_log.debug(sb.toString());
		}

		runSQL(sb.toString());
	}

	private static final String _ARTICLE_CLASS_NAME =
		"com.liferay.knowledgebase.model.Article";

	private static final String _COMMENT_CLASS_NAME =
		"com.liferay.knowledgebase.model.Comment";

	private static final String _KB_ARTICLE_CLASS_NAME =
		"com.liferay.knowledgebase.model.KBArticle";

	private static final String _KB_COMMENT_CLASS_NAME =
		"com.liferay.knowledgebase.model.KBComment";

	private static final String _KB_TEMPLATE_CLASS_NAME =
		"com.liferay.knowledgebase.model.KBTemplate";

	private static final String _TEMPLATE_CLASS_NAME =
		"com.liferay.knowledgebase.model.Template";

	private static Log _log = LogFactoryUtil.getLog(UpgradeClassName.class);

}