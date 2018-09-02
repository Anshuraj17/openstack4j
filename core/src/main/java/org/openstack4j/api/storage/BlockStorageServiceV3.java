package org.openstack4j.api.storage;

import org.openstack4j.api.storage.ext.BlockStorageServiceService;
import org.openstack4j.api.storage.ext.BlockStorageServiceServiceV3;
import org.openstack4j.common.RestService;
import org.openstack4j.model.storage.block.BlockLimits;

/**
 * Block Storage (Cinder) Service Operation API
 * 
 * @author Jeremy Unruh
 */
public interface BlockStorageServiceV3 extends RestService {

	/**
	 * @return the Volume Service API
	 */
	BlockVolumeServiceV3 volumes();
	
	/**
	 * @return the Volume Snapshot Service API
	 */
	BlockVolumeSnapshotServiceV3 snapshots();
	
	CinderZoneServiceV3 zones();
	
	/**
	 * Gets the Absolute limits used by this tenant
	 * 
	 * @return the absolute limits
	 */
	BlockLimits getLimits();
	
	/**
	 * The block storage quota-set service.  
	 * 
	 * @return the quota-set service
	 */
	BlockQuotaSetServiceV3 quotaSets();

	/**
	 * The block storage get_pools service.
	 *
	 * @return the scheduler stats service
	 */
	SchedulerStatsGetPoolServiceV3 schedulerStatsPools();
	
	/**
	 * @return the Volume Service API
	 */
	BlockVolumeBackupServiceV3 backups();
	
	/**
	 * The block storage service service
	 * 
	 * @return ServiceService
	 */
	 BlockStorageServiceServiceV3 services();
}
