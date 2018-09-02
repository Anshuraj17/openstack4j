package org.openstack4j.api.storage;

import org.openstack4j.common.RestService;
import org.openstack4j.openstack.storage.block.domain.AvailabilityZone;

import java.util.List;

/**
  * @author Jeff Hu
  * list all available cinder zones
  */
public interface CinderZoneServiceV3 extends RestService {

	List<? extends AvailabilityZone> list();
}
