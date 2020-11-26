package io.swagger.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
import io.swagger.model.PropertyTypesItem;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T14:51:08.605Z[GMT]")
@Controller
public class PropertTypesApiController implements PropertTypesApi {

    private static final Logger log = LoggerFactory.getLogger(PropertTypesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PropertTypesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<PropertyTypesItem>> searchPropertyTypes(@ApiParam(value = "pass an optional search string for looking up propertyTypes") @Valid @RequestParam(value = "searchString", required = false) String searchString
,@Min(0)@ApiParam(value = "number of records to skip for pagination", allowableValues = "") @Valid @RequestParam(value = "skip", required = false) Integer skip
,@Min(0) @Max(50) @ApiParam(value = "maximum number of records to return", allowableValues = "") @Valid @RequestParam(value = "limit", required = false) Integer limit
) {
        // Jenkins Test
        // Trigger SCM Poll//
        String xy = "hallo";
        String zz = "hallo";
        if(zz == xy){
            System.out.println("upps");
        }
    
        //bug2Test
        List<String> newList = new ArrayList<>();
        assert newList.remove(newList.get(0));
    
        //bug1Test
        int target = -5;
        int num = 3;
        target =- num;  // Noncompliant; target = -3. Is that really what's meant?
        target =+ num; // Noncompliant; target = 3
        
        
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<PropertyTypesItem>>(objectMapper.readValue("[ {\n  \"_isMimeAsset\" : true,\n  \"_marketDependent\" : true,\n  \"_baseType\" : \"String\",\n  \"_owner\" : \"15\",\n  \"_customerDependent\" : true,\n  \"isEnum\" : true,\n  \"_typeId\" : \"pt11_424242\",\n  \"_typeKey\" : \"017/_typeKey\",\n  \"_languageDependent\" : true,\n  \"_isList\" : true,\n  \"isComposite\" : true,\n  \"_systemKey\" : \"017/_systemKey\",\n  \"_description\" : \"017/_description\"\n}, {\n  \"_isMimeAsset\" : true,\n  \"_marketDependent\" : true,\n  \"_baseType\" : \"String\",\n  \"_owner\" : \"15\",\n  \"_customerDependent\" : true,\n  \"isEnum\" : true,\n  \"_typeId\" : \"pt11_424242\",\n  \"_typeKey\" : \"017/_typeKey\",\n  \"_languageDependent\" : true,\n  \"_isList\" : true,\n  \"isComposite\" : true,\n  \"_systemKey\" : \"017/_systemKey\",\n  \"_description\" : \"017/_description\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<PropertyTypesItem>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<PropertyTypesItem>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
