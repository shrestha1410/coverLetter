package com.coverletter.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Getter
@Setter
public class RequestDto {
    private String name;
    private String address;
    private String zip;
    private String mobileNumber;
    private String MailId;
    private String currentdate;
    private String hrName;
    private String hrTitle;
    private String companyName;
    private String companyAddress;
    private String companyZip;
    private String currentCompany;
    private String jobTitle;
    private String jobSource;

}
