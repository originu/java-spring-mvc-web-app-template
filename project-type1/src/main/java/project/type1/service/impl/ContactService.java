package project.type1.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import project.type1.dto.ContactDto;
import project.type1.mapper.api.IContactMapper;
import project.type1.service.api.IContactService;

@Service
public class ContactService implements IContactService {

	private static Logger	logger	= LoggerFactory.getLogger(ContactService.class);
	
	@Autowired
	private IContactMapper	mapper;
	
	@Autowired
	PlatformTransactionManager	trxManager;
	
	@Override
	public ContactDto get(long id) {
		return mapper.get(id);
	}

	public int update(long id, String tel) {
		TransactionStatus trx = trxManager.getTransaction( new DefaultTransactionDefinition() );
		try {
			int update = mapper.update( id, tel );
			System.out.println();
			trxManager.commit( trx );
			return update;
		} catch ( DataAccessException e) {
			trxManager.rollback( trx );
			throw e;
		}
	}

}
