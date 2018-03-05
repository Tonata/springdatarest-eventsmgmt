package com.martian.springdatarest.repos;

import com.martian.springdatarest.entities.Event;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by martian on 2018/03/06.
 */
public interface EventRepository extends CrudRepository<Event, Long> {
}
