package com.pan.jdk8.collectors;

import com.pan.jdk8.pojo.EnumT1;
import com.pan.jdk8.pojo.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListTest {

    public static void main(String[] args) {

        List<User> userList =new ArrayList<>();
        for (int i =0;i<10 ;i++){
            User u = new User();
            u.setId(i);
            userList.add(u);
        }


        Stream<User> userStream = userList.stream().filter(user -> user.getId() == 1);
        System.out.println(userStream.collect(Collectors.toList()));

//        List<Integer> tecDealerList
//                = interfaceDealerList.stream().filter(x -> tecContractTypeStr.contains("," + x.getContractType().toString() + ","))
//                .map(x -> x.getDealerId()).sorted((x, y) -> y - x).distinct()
//                .collect(Collectors.toList());


        System.out.println(EnumT1.EWYYX.getValue());
        System.out.println( EnumT1.getValue(-1)+"------------");

    }
}
