package ma.alicode.ecom.config;

import ma.alicode.ecom.entity.ProductCategory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

/**
 * le but de cette classe est de configurer ou customiser les rest API pour les rend readOnly ou selon nos besoin
 */

@Configuration
public class MyDataRestConfiguration implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors){
        //for products
        HttpMethod[] unsupportedActions = {HttpMethod.PUT, HttpMethod.DELETE, HttpMethod.POST};
        config.getExposureConfiguration()
                .forDomainType(Process.class)
                .withItemExposure(((metdata, httpMethods) -> httpMethods.disable(unsupportedActions)))
                .withCollectionExposure((((metdata, httpMethods) -> httpMethods.disable(unsupportedActions))));
        //for ProductCategory
        config.getExposureConfiguration()
                .forDomainType(ProductCategory.class)
                .withItemExposure((((metdata, httpMethods) -> httpMethods.disable(unsupportedActions))))
                .withCollectionExposure((((metdata, httpMethods) -> httpMethods.disable(unsupportedActions))));


    }
}
