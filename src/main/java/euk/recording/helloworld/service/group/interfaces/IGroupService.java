package euk.recording.helloworld.service.group.interfaces;

import euk.recording.helloworld.DAO.group.interfaces.IGroupDAO;
import euk.recording.helloworld.model.Group;

public interface IGroupService extends IGroupDAO {
    Group getByName(String name);
}

@Override
public List <Group> getByName(String name)
{
    return groupDAOFake.getAll()List<Group>;




}