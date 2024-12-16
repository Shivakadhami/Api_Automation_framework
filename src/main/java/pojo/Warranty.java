package pojo;

import java.util.List;

public class Warranty
{

     public Warranty()
     {

     }

        private String inspectionType;
        private Data data;

        // Getter and Setter for inspectionType
        public String getInspectionType() {
            return inspectionType;
        }

        public void setInspectionType(String inspectionType) {
            this.inspectionType = inspectionType;
        }

        // Getter and Setter for data
        public Data getData() {
            return data;
        }

        public void setData(Data data) {
            this.data = data;
        }

        // Inner class for "data"
        public static class Data {

            private String action;
            private WarrantyDetails warrantyDetails;

            // Getter and Setter for action
            public String getAction() {
                return action;
            }

            public void setAction(String action) {
                this.action = action;
            }

            // Getter and Setter for warrantyDetails
            public WarrantyDetails getWarrantyDetails() {
                return warrantyDetails;
            }

            public void setWarrantyDetails(WarrantyDetails warrantyDetails) {
                this.warrantyDetails = warrantyDetails;
            }


            // Inner class for "warrantyDetails"
            public static class WarrantyDetails {

                private Values warrantyValidityMileage;
                private Values smcAvailable;
                private Values warrantyType;
                private Values lastServiceDate;
                private Values serviceHistoryAvailable;
                private Values warrantyValidityDate;
                private Values smcValidityDate;
                private Values accidentFree;

                // Getter and Setter for warrantyValidityMileage
                public Values getWarrantyValidityMileage() {
                    return warrantyValidityMileage;
                }

                public void setWarrantyValidityMileage(Values warrantyValidityMileage) {
                    this.warrantyValidityMileage = warrantyValidityMileage;
                }

                // Getter and Setter for smcAvailable
                public Values getSmcAvailable() {
                    return smcAvailable;
                }

                public void setSmcAvailable(Values smcAvailable) {
                    this.smcAvailable = smcAvailable;
                }

                // Getter and Setter for warrantyType
                public Values getWarrantyType() {
                    return warrantyType;
                }

                public void setWarrantyType(Values warrantyType) {
                    this.warrantyType = warrantyType;
                }

                // Getter and Setter for lastServiceDate
                public Values getLastServiceDate() {
                    return lastServiceDate;
                }

                public void setLastServiceDate(Values lastServiceDate) {
                    this.lastServiceDate = lastServiceDate;
                }

                // Getter and Setter for serviceHistoryAvailable
                public Values getServiceHistoryAvailable() {
                    return serviceHistoryAvailable;
                }

                public void setServiceHistoryAvailable(Values serviceHistoryAvailable) {
                    this.serviceHistoryAvailable = serviceHistoryAvailable;
                }

                // Getter and Setter for warrantyValidityDate
                public Values getWarrantyValidityDate() {
                    return warrantyValidityDate;
                }

                public void setWarrantyValidityDate(Values warrantyValidityDate) {
                    this.warrantyValidityDate = warrantyValidityDate;
                }

                // Getter and Setter for smcValidityDate
                public Values getSmcValidityDate() {
                    return smcValidityDate;
                }

                public void setSmcValidityDate(Values smcValidityDate) {
                    this.smcValidityDate = smcValidityDate;
                }

                // Getter and Setter for accidentFree
                public Values getAccidentFree() {
                    return accidentFree;
                }

                public void setAccidentFree(Values accidentFree) {
                    this.accidentFree = accidentFree;
                }

                // Inner class for "Values" to hold the array values
                public static class Values {

                    private List<String> values;
                    private List<Image> images;

                    // Getter and Setter for values
                    public List<String> getValues() {
                        return values;
                    }

                    public void setValues(List<String> values) {
                        this.values = values;
                    }

                    // Getter and Setter for images
                    public List<Image> getImages() {
                        return images;
                    }

                    public void setImages(List<Image> images) {
                        this.images = images;
                    }

                    // Inner class for "images"
                    public static class Image {

                        private boolean loading;
                        private String label;
                        private String path;
                        private boolean updated;

                        // Getter and Setter for loading
                        public boolean isLoading() {
                            return loading;
                        }

                        public void setLoading(boolean loading) {
                            this.loading = loading;
                        }

                        // Getter and Setter for label
                        public String getLabel() {
                            return label;
                        }

                        public void setLabel(String label) {
                            this.label = label;
                        }

                        // Getter and Setter for path
                        public String getPath() {
                            return path;
                        }

                        public void setPath(String path) {
                            this.path = path;
                        }

                        // Getter and Setter for updated
                        public boolean isUpdated() {
                            return updated;
                        }

                        public void setUpdated(boolean updated) {
                            this.updated = updated;
                        }
                    }
                }
            }
        }
}


