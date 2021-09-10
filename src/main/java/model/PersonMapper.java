package model;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface PersonMapper {

    @Mapping(target = "nom", source = "name")
    PersonDTO toDTO(Person model);
    @Mapping(target = "name", source = "nom")
    Person toModel(PersonDTO dto);

}
