package com.company.Utils;




import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyElasticJob implements SimpleJob {
    @Override
    public void execute(ShardingContext context) {
        int a = context.getShardingItem();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(Thread.currentThread().getId() + "," + sf.format(new Date()) + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" + a);
    }
}
