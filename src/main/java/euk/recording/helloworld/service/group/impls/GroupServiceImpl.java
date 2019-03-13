package euk.recording.helloworld.service.group.impls;

import euk.recording.helloworld.DAO.group.impls.GroupDAOFakeImpl;
import euk.recording.helloworld.model.Group;
import euk.recording.helloworld.service.group.interfaces.IGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements IGroupService {

    @Autowired
    GroupDAOFakeImpl groupDAOFake;

    @Override
    public Group create(Group group) {
        return groupDAOFake.create(group);
    }

    @Override
    public Group get(int id) {
        return groupDAOFake.get(id);
    }

    @Override
    public Group update(Group group) {
        return groupDAOFake.update(group);
    }

    @Override
    public Group delete(int id) {
        return groupDAOFake.delete(id);
    }

    @Override
    public List<Group> getAll() {
        return groupDAOFake.getAll();
    }

    @Override
    public Group getByName(String name) {
        return null;
    }
}
