package review.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import review.dao.ReviewMapper;

@Service
public class ReviewService implements InitializingBean {

    @Autowired
    private ReviewMapper reviewMapper;

    @Override
    public void afterPropertiesSet() throws Exception {
        reviewMapper.selectByPrimaryKey(1);
    }
}
