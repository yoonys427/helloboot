package com.sk.helloboot.repository.querydsl;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sk.helloboot.model.Ticket;

@Repository
public interface StudentRepositoryCustom {

	List<Ticket> getAllTickets();
}
