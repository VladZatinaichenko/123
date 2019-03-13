package euk.recording.helloworld.service.group.impls;

import euk.recording.helloworld.DAO.group.impls.GroupDAOFakeImpl;
import euk.recording.helloworld.model.Group;
import org.hibernate.validator.internal.metadata.raw.BeanConfiguration;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@ContextConfiguration
public class GroupServiceImplTest {

    @Autowired
    private ApplicationContext context;


    GroupDAOFakeImpl groupDAOFake = context.getBean(GroupDAOFakeImpl.class);

    @Test
    public void create() {

    }

    @Test
    public void get() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
        int maxId = groupDAOFake.getAll()
                .stream()
                .mapToInt(Group::getId)
                .max()
                .getAsInt();

        int primarySize = groupDAOFake.getAll().size();
        groupDAOFake.delete(maxId);
        int newSize = groupDAOFake.getAll().size();
        Assert.assertEquals(primarySize - 1, newSize);
    }

    @Test
    public void getAll() {
    }

    @Test
    public void getByName() {
    }
}