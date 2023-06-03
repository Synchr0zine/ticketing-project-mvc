package com.cydeo.service;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.dto.UserDTO;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

public interface ProjectService extends CrudService<ProjectDTO,String> {

    void complete(ProjectDTO project);
    List<ProjectDTO> getCountedListOfProjectDTO(UserDTO manager);

}
