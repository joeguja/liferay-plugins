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

package com.liferay.portal.saml.service;

/**
 * <p>
 * This class is a wrapper for {@link SPSessionLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       SPSessionLocalService
 * @generated
 */
public class SPSessionLocalServiceWrapper implements SPSessionLocalService {
	public SPSessionLocalServiceWrapper(
		SPSessionLocalService spSessionLocalService) {
		_spSessionLocalService = spSessionLocalService;
	}

	/**
	* Adds the s p session to the database. Also notifies the appropriate model listeners.
	*
	* @param spSession the s p session to add
	* @return the s p session that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.saml.model.SPSession addSPSession(
		com.liferay.portal.saml.model.SPSession spSession)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _spSessionLocalService.addSPSession(spSession);
	}

	/**
	* Creates a new s p session with the primary key. Does not add the s p session to the database.
	*
	* @param spSessionId the primary key for the new s p session
	* @return the new s p session
	*/
	public com.liferay.portal.saml.model.SPSession createSPSession(
		long spSessionId) {
		return _spSessionLocalService.createSPSession(spSessionId);
	}

	/**
	* Deletes the s p session with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param spSessionId the primary key of the s p session to delete
	* @throws PortalException if a s p session with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteSPSession(long spSessionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_spSessionLocalService.deleteSPSession(spSessionId);
	}

	/**
	* Deletes the s p session from the database. Also notifies the appropriate model listeners.
	*
	* @param spSession the s p session to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteSPSession(
		com.liferay.portal.saml.model.SPSession spSession)
		throws com.liferay.portal.kernel.exception.SystemException {
		_spSessionLocalService.deleteSPSession(spSession);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _spSessionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _spSessionLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _spSessionLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _spSessionLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the s p session with the primary key.
	*
	* @param spSessionId the primary key of the s p session to get
	* @return the s p session
	* @throws PortalException if a s p session with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.saml.model.SPSession getSPSession(
		long spSessionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _spSessionLocalService.getSPSession(spSessionId);
	}

	/**
	* Gets a range of all the s p sessions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s p sessions to return
	* @param end the upper bound of the range of s p sessions to return (not inclusive)
	* @return the range of s p sessions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.saml.model.SPSession> getSPSessions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _spSessionLocalService.getSPSessions(start, end);
	}

	/**
	* Gets the number of s p sessions.
	*
	* @return the number of s p sessions
	* @throws SystemException if a system exception occurred
	*/
	public int getSPSessionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _spSessionLocalService.getSPSessionsCount();
	}

	/**
	* Updates the s p session in the database. Also notifies the appropriate model listeners.
	*
	* @param spSession the s p session to update
	* @return the s p session that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.saml.model.SPSession updateSPSession(
		com.liferay.portal.saml.model.SPSession spSession)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _spSessionLocalService.updateSPSession(spSession);
	}

	/**
	* Updates the s p session in the database. Also notifies the appropriate model listeners.
	*
	* @param spSession the s p session to update
	* @param merge whether to merge the s p session with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the s p session that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.saml.model.SPSession updateSPSession(
		com.liferay.portal.saml.model.SPSession spSession, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _spSessionLocalService.updateSPSession(spSession, merge);
	}

	public com.liferay.portal.saml.model.SPSession addSPSession(
		long ssoSessionId, java.lang.String issuer,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _spSessionLocalService.addSPSession(ssoSessionId, issuer,
			serviceContext);
	}

	public java.util.List<com.liferay.portal.saml.model.SPSession> findBySSOSessionId(
		long ssoSessionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _spSessionLocalService.findBySSOSessionId(ssoSessionId);
	}

	public com.liferay.portal.saml.model.SPSession findByS_I(long sessionId,
		java.lang.String issuer)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _spSessionLocalService.findByS_I(sessionId, issuer);
	}

	public SPSessionLocalService getWrappedSPSessionLocalService() {
		return _spSessionLocalService;
	}

	public void setWrappedSPSessionLocalService(
		SPSessionLocalService spSessionLocalService) {
		_spSessionLocalService = spSessionLocalService;
	}

	private SPSessionLocalService _spSessionLocalService;
}