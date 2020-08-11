package Задание_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentGroupIterator implements Iterable<StudentGroup> {

    List<StudentGroup> studentGroupList;

    public StudentGroupIterator(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroupList.iterator();
    }

    public StudentGroup getGroup(String groupName){
        return studentGroupList.stream().filter(group -> group.getGroupName().equals(groupName)).collect(Collectors.toList()).get(0);
    }
}
