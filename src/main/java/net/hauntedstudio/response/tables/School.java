package net.hauntedstudio.response.tables;

import org.json.JSONObject;

public class School {
    // Fields (already declared)
    private String name;
    private String schoolLocalId;
    private String address;
    private String postCode;
    private String city;
    private String country;
    private boolean isValid;
    private String schoolTypeId;
    private String schoolTypeName;
    private String organizationType;
    private String purchasedFeature;
    private String purchasedUntil;
    private String purchasedFeatureChangedOn;
    private String officialEmail;
    private String region;
    private String currentSchoolYearStart;
    private String currentSchoolYearEnd;
    private String referral;
    private String price;
    private String isVatIncluded;
    private String currency;
    private String numberOfPupils;
    private String applicationType;
    private String holder;
    private String colorCode;
    private String billingName;
    private String billingAddress;
    private String billingPostCode;
    private String billingCity;
    private String billingCountry;
    private String billingTaxNumber;
    private String isSameBillingAddress;
    private boolean hasTeamClass;
    private String isContractUploaded;
    private String isDpaUploaded;
    private String lastContractUploadDate;
    private String fastBillCustomerId;
    private boolean appsIntegrationsEnabled;
    private boolean isHolderOrganization;
    private String holderOrganizationId;
    private String numberOfSubordinateOrganizations;
    private String hubSpotCompanyId;
    private String ownerUserId;
    private String ownerUserFullName;
    private boolean areTranslationsAllowed;
    private boolean allowMisIntegrations;
    private String specialLicense;
    private boolean hasUntis;
    private boolean hasNetGo;
    private boolean hasUnivention;
    private String externalId;
    private String translationService;
    private String archiveRetentionDays;
    private String id;
    private String createdAt;
    private String createdBy;
    private String updatedAt;
    private String updatedBy;
    private boolean deleted;
    private String version;
    private boolean isActive;

    // Constructor
    public School(JSONObject responseJson) {
        this.name = responseJson.optString("name");
        this.schoolLocalId = responseJson.optString("schoolLocalId");
        this.address = responseJson.optString("address");
        this.postCode = responseJson.optString("postCode");
        this.city = responseJson.optString("city");
        this.country = responseJson.optString("country");
        this.isValid = responseJson.optBoolean("isValid");
        this.schoolTypeId = responseJson.optString("schoolTypeId");
        this.schoolTypeName = responseJson.optString("schoolTypeName");
        this.organizationType = responseJson.optString("organizationType");
        this.purchasedFeature = responseJson.optString("purchasedFeature");
        this.purchasedUntil = responseJson.optString("purchasedUntil");
        this.purchasedFeatureChangedOn = responseJson.optString("purchasedFeatureChangedOn");
        this.officialEmail = responseJson.optString("officialEmail");
        this.region = responseJson.optString("region");
        this.currentSchoolYearStart = responseJson.optString("currentSchoolYearStart");
        this.currentSchoolYearEnd = responseJson.optString("currentSchoolYearEnd");
        this.referral = responseJson.optString("referral");
        this.price = responseJson.optString("price");
        this.isVatIncluded = responseJson.optString("isVatIncluded");
        this.currency = responseJson.optString("currency");
        this.numberOfPupils = responseJson.optString("numberOfPupils");
        this.applicationType = responseJson.optString("applicationType");
        this.holder = responseJson.optString("holder");
        this.colorCode = responseJson.optString("colorCode");
        this.billingName = responseJson.optString("billingName");
        this.billingAddress = responseJson.optString("billingAddress");
        this.billingPostCode = responseJson.optString("billingPostCode");
        this.billingCity = responseJson.optString("billingCity");
        this.billingCountry = responseJson.optString("billingCountry");
        this.billingTaxNumber = responseJson.optString("billingTaxNumber");
        this.isSameBillingAddress = responseJson.optString("isSameBillingAddress");
        this.hasTeamClass = responseJson.optBoolean("hasTeamClass");
        this.isContractUploaded = responseJson.optString("isContractUploaded");
        this.isDpaUploaded = responseJson.optString("isDpaUploaded");
        this.lastContractUploadDate = responseJson.optString("lastContractUploadDate");
        this.fastBillCustomerId = responseJson.optString("fastBillCustomerId");
        this.appsIntegrationsEnabled = responseJson.optBoolean("appsIntegrationsEnabled");
        this.isHolderOrganization = responseJson.optBoolean("isHolderOrganization");
        this.holderOrganizationId = responseJson.optString("holderOrganizationId");
        this.numberOfSubordinateOrganizations = responseJson.optString("numberOfSubordinateOrganizations");
        this.hubSpotCompanyId = responseJson.optString("hubSpotCompanyId");
        this.ownerUserId = responseJson.optString("ownerUserId");
        this.ownerUserFullName = responseJson.optString("ownerUserFullName");
        this.areTranslationsAllowed = responseJson.optBoolean("areTranslationsAllowed");
        this.allowMisIntegrations = responseJson.optBoolean("allowMisIntegrations");
        this.specialLicense = responseJson.optString("specialLicense");
        this.hasUntis = responseJson.optBoolean("hasUntis");
        this.hasNetGo = responseJson.optBoolean("hasNetGo");
        this.hasUnivention = responseJson.optBoolean("hasUnivention");
        this.externalId = responseJson.optString("externalId");
        this.translationService = responseJson.optString("translationService");
        this.archiveRetentionDays = responseJson.optString("archiveRetentionDays");
        this.id = responseJson.optString("id");
        this.createdAt = responseJson.optString("createdAt");
        this.createdBy = responseJson.optString("createdBy");
        this.updatedAt = responseJson.optString("updatedAt");
        this.updatedBy = responseJson.optString("updatedBy");
        this.deleted = responseJson.optBoolean("deleted");
        this.version = responseJson.optString("version");
        this.isActive = responseJson.optBoolean("isActive");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolLocalId() {
        return schoolLocalId;
    }

    public void setSchoolLocalId(String schoolLocalId) {
        this.schoolLocalId = schoolLocalId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public String getSchoolTypeId() {
        return schoolTypeId;
    }

    public void setSchoolTypeId(String schoolTypeId) {
        this.schoolTypeId = schoolTypeId;
    }

    public String getSchoolTypeName() {
        return schoolTypeName;
    }

    public void setSchoolTypeName(String schoolTypeName) {
        this.schoolTypeName = schoolTypeName;
    }

    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }

    public String getPurchasedFeature() {
        return purchasedFeature;
    }

    public void setPurchasedFeature(String purchasedFeature) {
        this.purchasedFeature = purchasedFeature;
    }

    public String getPurchasedUntil() {
        return purchasedUntil;
    }

    public void setPurchasedUntil(String purchasedUntil) {
        this.purchasedUntil = purchasedUntil;
    }

    public String getPurchasedFeatureChangedOn() {
        return purchasedFeatureChangedOn;
    }

    public void setPurchasedFeatureChangedOn(String purchasedFeatureChangedOn) {
        this.purchasedFeatureChangedOn = purchasedFeatureChangedOn;
    }

    public String getOfficialEmail() {
        return officialEmail;
    }

    public void setOfficialEmail(String officialEmail) {
        this.officialEmail = officialEmail;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCurrentSchoolYearStart() {
        return currentSchoolYearStart;
    }

    public void setCurrentSchoolYearStart(String currentSchoolYearStart) {
        this.currentSchoolYearStart = currentSchoolYearStart;
    }

    public String getCurrentSchoolYearEnd() {
        return currentSchoolYearEnd;
    }

    public void setCurrentSchoolYearEnd(String currentSchoolYearEnd) {
        this.currentSchoolYearEnd = currentSchoolYearEnd;
    }

    public String getReferral() {
        return referral;
    }

    public void setReferral(String referral) {
        this.referral = referral;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getIsVatIncluded() {
        return isVatIncluded;
    }

    public void setIsVatIncluded(String isVatIncluded) {
        this.isVatIncluded = isVatIncluded;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getNumberOfPupils() {
        return numberOfPupils;
    }

    public void setNumberOfPupils(String numberOfPupils) {
        this.numberOfPupils = numberOfPupils;
    }

    public String getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getBillingName() {
        return billingName;
    }

    public void setBillingName(String billingName) {
        this.billingName = billingName;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getBillingPostCode() {
        return billingPostCode;
    }

    public void setBillingPostCode(String billingPostCode) {
        this.billingPostCode = billingPostCode;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public String getBillingTaxNumber() {
        return billingTaxNumber;
    }

    public void setBillingTaxNumber(String billingTaxNumber) {
        this.billingTaxNumber = billingTaxNumber;
    }

    public String getIsSameBillingAddress() {
        return isSameBillingAddress;
    }

    public void setIsSameBillingAddress(String isSameBillingAddress) {
        this.isSameBillingAddress = isSameBillingAddress;
    }

    public boolean isHasTeamClass() {
        return hasTeamClass;
    }

    public void setHasTeamClass(boolean hasTeamClass) {
        this.hasTeamClass = hasTeamClass;
    }

    public String getIsContractUploaded() {
        return isContractUploaded;
    }

    public void setIsContractUploaded(String isContractUploaded) {
        this.isContractUploaded = isContractUploaded;
    }

    public String getIsDpaUploaded() {
        return isDpaUploaded;
    }

    public void setIsDpaUploaded(String isDpaUploaded) {
        this.isDpaUploaded = isDpaUploaded;
    }

    public String getLastContractUploadDate() {
        return lastContractUploadDate;
    }

    public void setLastContractUploadDate(String lastContractUploadDate) {
        this.lastContractUploadDate = lastContractUploadDate;
    }

    public String getFastBillCustomerId() {
        return fastBillCustomerId;
    }

    public void setFastBillCustomerId(String fastBillCustomerId) {
        this.fastBillCustomerId = fastBillCustomerId;
    }

    public boolean isAppsIntegrationsEnabled() {
        return appsIntegrationsEnabled;
    }

    public void setAppsIntegrationsEnabled(boolean appsIntegrationsEnabled) {
        this.appsIntegrationsEnabled = appsIntegrationsEnabled;
    }

    public boolean isHolderOrganization() {
        return isHolderOrganization;
    }

    public void setHolderOrganization(boolean holderOrganization) {
        isHolderOrganization = holderOrganization;
    }

    public String getHolderOrganizationId() {
        return holderOrganizationId;
    }

    public void setHolderOrganizationId(String holderOrganizationId) {
        this.holderOrganizationId = holderOrganizationId;
    }

    public String getNumberOfSubordinateOrganizations() {
        return numberOfSubordinateOrganizations;
    }

    public void setNumberOfSubordinateOrganizations(String numberOfSubordinateOrganizations) {
        this.numberOfSubordinateOrganizations = numberOfSubordinateOrganizations;
    }

    public String getHubSpotCompanyId() {
        return hubSpotCompanyId;
    }

    public void setHubSpotCompanyId(String hubSpotCompanyId) {
        this.hubSpotCompanyId = hubSpotCompanyId;
    }

    public String getOwnerUserId() {
        return ownerUserId;
    }

    public void setOwnerUserId(String ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public String getOwnerUserFullName() {
        return ownerUserFullName;
    }

    public void setOwnerUserFullName(String ownerUserFullName) {
        this.ownerUserFullName = ownerUserFullName;
    }

    public boolean isAreTranslationsAllowed() {
        return areTranslationsAllowed;
    }

    public void setAreTranslationsAllowed(boolean areTranslationsAllowed) {
        this.areTranslationsAllowed = areTranslationsAllowed;
    }

    public boolean isAllowMisIntegrations() {
        return allowMisIntegrations;
    }

    public void setAllowMisIntegrations(boolean allowMisIntegrations) {
        this.allowMisIntegrations = allowMisIntegrations;
    }

    public String getSpecialLicense() {
        return specialLicense;
    }

    public void setSpecialLicense(String specialLicense) {
        this.specialLicense = specialLicense;
    }

    public boolean isHasUntis() {
        return hasUntis;
    }

    public void setHasUntis(boolean hasUntis) {
        this.hasUntis = hasUntis;
    }

    public boolean isHasNetGo() {
        return hasNetGo;
    }

    public void setHasNetGo(boolean hasNetGo) {
        this.hasNetGo = hasNetGo;
    }

    public boolean isHasUnivention() {
        return hasUnivention;
    }

    public void setHasUnivention(boolean hasUnivention) {
        this.hasUnivention = hasUnivention;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getTranslationService() {
        return translationService;
    }

    public void setTranslationService(String translationService) {
        this.translationService = translationService;
    }

    public String getArchiveRetentionDays() {
        return archiveRetentionDays;
    }

    public void setArchiveRetentionDays(String archiveRetentionDays) {
        this.archiveRetentionDays = archiveRetentionDays;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
