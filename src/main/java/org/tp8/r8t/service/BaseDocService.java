package org.tp8.r8t.service;

import java.awt.print.Pageable;
import java.io.Serializable;

import javax.jws.WebParam;

import org.springframework.data.domain.Page;
import org.tp8.r8t.exc.GenericException;
import org.tp8.r8t.model.AbstractModel;

/**
 * The Interface BaseEntityService.
 * 
 * @param <K>
 *            the key type
 * @param <T>
 *            the generic type
 */
public interface BaseDocService<K extends Serializable, T extends AbstractModel>
		extends BaseService, Serializable {

	/**
	 * Save.
	 * 
	 * @param t
	 *            the t
	 * @return the t
	 * @throws GenericException
	 *             the sample app exception
	 */
	public String save(T t) throws GenericException;

	/**
	 * Delete.
	 * 
	 * @param id
	 *            the id
	 * @throws GenericException
	 *             the sample app exception
	 */
	public void delete(K id) throws GenericException;

	/**
	 * Find one.
	 * 
	 * @param id
	 *            the id
	 * @return the t
	 * @throws GenericException
	 *             the sample app exception
	 */
	public T findOne(K id) throws GenericException;

	/**
	 * Find attachment.
	 * 
	 * @param id
	 *            the id
	 * @return the byte[]
	 * @throws GenericException
	 *             the sample app exception
	 */
	public byte[] findAttachment(K id) throws GenericException;

	/**
	 * Find metadata.
	 * 
	 * @param id
	 *            the id
	 * @return the t
	 * @throws GenericException
	 *             the sample app exception
	 */
	public T findMetadata(K id) throws GenericException;

	/**
	 * Find all.
	 * 
	 * @param pageable
	 *            the pageable
	 * @return the page
	 * @throws GenericException
	 *             the sample app exception
	 */
	public Page<T> findAll(@WebParam(name = "pageable") Pageable pageable)
			throws GenericException;

	/**
	 * Count.
	 * 
	 * @return the long
	 * @throws GenericException
	 *             the sample app exception
	 */
	public long count() throws GenericException;

}
