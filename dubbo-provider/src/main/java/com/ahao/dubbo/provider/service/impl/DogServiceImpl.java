package com.ahao.dubbo.provider.service.impl;

import com.ahao.dubbo.bean.DogVO;
import com.ahao.dubbo.provider.service.IDogService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ahao
 * @since 2019/9/15 下午9:51
 */
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
        return dogs;
    }
}
