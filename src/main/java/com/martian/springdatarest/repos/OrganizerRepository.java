package com.martian.springdatarest.repos;

import com.martian.springdatarest.entities.Organizer;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by martian on 2018/03/06.
 */
public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long> {
}
