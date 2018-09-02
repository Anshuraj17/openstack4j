package org.openstack4j.openstack.storage.block.internal;

import org.openstack4j.api.types.ServiceType;
import org.openstack4j.openstack.common.functions.EnforceVersionToURL;
import org.openstack4j.openstack.internal.BaseOpenStackService;

/**
 * Base Cinder Service Layer
 *
 * @author Jeremy Unruh
 */
public class BaseBlockStorageServicesV3 extends BaseOpenStackService {

	public BaseBlockStorageServicesV3() {
		super(ServiceType.BLOCK_STORAGE_V3);
	}

}
