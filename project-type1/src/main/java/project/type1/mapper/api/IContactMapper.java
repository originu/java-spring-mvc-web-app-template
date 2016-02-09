package project.type1.mapper.api;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import project.type1.dto.ContactDto;

@Repository
public interface IContactMapper {

	ContactDto get(long id);

	int update(@Param("id")long id, @Param("tel")String tel);
	
}
