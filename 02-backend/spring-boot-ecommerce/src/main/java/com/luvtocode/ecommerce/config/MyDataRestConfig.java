package com.luvtocode.ecommerce.config;

import com.luvtocode.ecommerce.entity.Product;
import com.luvtocode.ecommerce.entity.ProductCategory;

import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config){
         HttpMethod[] theUnsupportedActions = {HttpMethod.POST,HttpMethod.PUT,HttpMethod.DELETE};
         //disable http method for product except update 
         config.getExposureConfiguration()
         .forDomainType(Product.class) 
         .withItemExposure((metadata, httpMethods)-> httpMethods.disable(theUnsupportedActions))
         .withCollectionExposure((metadata, httpMethods)-> httpMethods.disable(theUnsupportedActions));
        
          //disable http method for product category except update 
          config.getExposureConfiguration()
          .forDomainType(ProductCategory.class) 
          .withItemExposure((metadata, httpMethods)-> httpMethods.disable(theUnsupportedActions))
          .withCollectionExposure((metadata, httpMethods)-> httpMethods.disable(theUnsupportedActions));
 
   
    }
}