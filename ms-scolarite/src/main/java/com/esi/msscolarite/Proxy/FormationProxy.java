package com.esi.msscolarite.Proxy;

import com.esi.msscolarite.Model.Formation;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
 // on enleve url dans @FeignClient
@FeignClient(name = "ms-formation" )
@LoadBalancerClient(name = "ms-formation")

public interface FormationProxy {


    @GetMapping("/formations/{id}")
    @CircuitBreaker(name = "fall" , fallbackMethod = "fallbackFormation")
    public Formation getFormation(@PathVariable("id") Long idf);
    default Formation fallbackFormation(@PathVariable("id") Long idf,Throwable throwable){
        if(idf.equals(1L))
            return new Formation(null ,"java",20);
        else if (idf.equals(2L))
            return new Formation(null ,"SpringBoot",20);
        return new Formation(null,"C++",30);

    }



}
