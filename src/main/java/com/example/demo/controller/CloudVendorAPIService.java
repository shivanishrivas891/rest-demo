package com.example.demo.controller;

import com.example.demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
    CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorID)
    {
         return new CloudVendor("C1","Vendor1",
             "Address1", "XXX");
    }
            @PostMapping
            public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
            {
                this.cloudVendor = cloudVendor;
                return "Cloud Vendor Created Successfully";

            }

//        @PostMapping
//        public String UpdateCloudVendorDetails (@RequestBody CloudVendor cloudVendor)
//        {
//            this.cloudVendor = cloudVendor;
//            return "Cloud Vendor Updated Successfully";
//
//        }
    //testing
    }



