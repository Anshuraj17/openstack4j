package org.openstack4j.openstack.storage.block.internal;

import org.openstack4j.api.Apis;
import org.openstack4j.api.storage.*;
import org.openstack4j.api.storage.ext.BlockStorageServiceService;
import org.openstack4j.api.storage.ext.BlockStorageServiceServiceV3;
import org.openstack4j.model.storage.block.BlockLimits;
import org.openstack4j.openstack.storage.block.domain.CinderBlockLimits;

/**
 * Block Storage (Cinder) Service Operation implementation
 * 
 * @author Jeremy Unruh
 */
public class BlockStorageServiceImplV3 extends BaseBlockStorageServicesV3 implements BlockStorageServiceV3 {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BlockVolumeServiceV3 volumes() {
		return Apis.get(BlockVolumeServiceV3.class);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BlockVolumeSnapshotServiceV3 snapshots() {
		return Apis.get(BlockVolumeSnapshotServiceV3.class);
	}

	/**
	 * {@inheritDoc}
	 */
    @Override
    public BlockLimits getLimits() {
        return get(CinderBlockLimits.class, "/limits").execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockQuotaSetServiceV3 quotaSets() {
        return Apis.get(BlockQuotaSetServiceV3.class);
    }

    @Override
    public CinderZoneServiceV3 zones()
    {
       return Apis.get(CinderZoneServiceV3.class);
    }

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchedulerStatsGetPoolServiceV3 schedulerStatsPools() { return Apis.get(SchedulerStatsGetPoolServiceV3.class); }

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BlockVolumeBackupServiceV3 backups() {
		return Apis.get(BlockVolumeBackupServiceV3.class);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BlockStorageServiceServiceV3 services() {
		return Apis.get(BlockStorageServiceServiceV3.class);
	}

}
