package com.ahao.boot.dubboproviderboot.service.impl;

import com.ahao.dubbo.bean.DogVO;
import com.ahao.dubbo.provider.service.IDogService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author ahao
 * @since 2019/9/15 下午9:51
 */
@Service
@Component
public class DogServiceImpl implements IDogService {

    @Override
    public List<DogVO> getDog(Integer masterId) {
        List<DogVO> dogs = new ArrayList<>();
        DogVO husky = new DogVO();
        husky.setId(1);
        husky.setName("Husky");
        husky.setMasterId(1);
        husky.setColor("black and white");
        dogs.add(husky);

        DogVO goldenRetriever = new DogVO();
        goldenRetriever.setId(2);
        goldenRetriever.setName("Golden Retriever");
        goldenRetriever.setMasterId(1);
        goldenRetriever.setColor("Golden");
        dogs.add(goldenRetriever);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return dogs;
    }
}
