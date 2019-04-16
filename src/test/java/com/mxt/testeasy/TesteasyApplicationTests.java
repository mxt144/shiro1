package com.mxt.testeasy;

import com.mxt.dao.EmpMapper;
import com.mxt.entity.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TesteasyApplicationTests {
    @Resource
    private EmpMapper empMapper;

    @Test
    public void contextLoads() {

        HashMap<String, String> map = new HashMap<>();

        List<Emp> emps = empMapper.selectAll();
        for (Emp emp : emps) {
            System.out.println(emp);
        }
    }

}
