package org.openstack4j.openstack.storage.block.internal;

import org.openstack4j.api.storage.ext.BlockStorageServiceService;
import org.openstack4j.api.storage.ext.BlockStorageServiceServiceV3;
import org.openstack4j.model.storage.block.ext.Service;
import org.openstack4j.openstack.storage.block.domain.ext.ExtService.Services;

import java.util.List;

/**
 * Block Storage Services service provides CRUD capabilities for Cinder service(s).
 *
 * @author Taemin
 */
public class BlockStorageServiceServiceImplV3 extends BaseBlockStorageServicesV3 implements BlockStorageServiceServiceV3 {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<? extends Service> list() {
		return get(Services.class, uri("/os-services")).execute().getList();
	}

}