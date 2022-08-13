package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job job = new Job("Product tester", new Employer("AMCE"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertEquals("Product tester", job.getName());
        assertEquals("AMCE", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
        assertTrue(job.getName() == "Product tester");
        assertTrue(job.getEmployer().getValue() == "AMCE");
        assertTrue(job.getLocation().getValue() == "Desert");
        assertTrue(job.getPositionType().getValue() == "Quality control");
        assertTrue(job.getCoreCompetency().getValue() == "Persistence");
    }

    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("Product tester", new Employer("AMCE"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("AMCE"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertFalse(job1 == job2);

    }

    @Test
    public void testToStringStartsAndEndWithNewLine(){
        Job job1 = new Job("Product tester", new Employer("AMCE"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        char firstChar = job1.toString().charAt(0);
        char lastChar = job1.toString().charAt(job1.toString().length()-1);
        assertEquals(firstChar, '\n');
        assertEquals(lastChar, '\n');
    }







}
