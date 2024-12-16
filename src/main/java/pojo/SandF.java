package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class SandF
{

    public  SandF()
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
            private SfCheckpointDetails sfCheckpointDetails;

            // Getter and Setter for action
            public String getAction() {
                return action;
            }

            public void setAction(String action) {
                this.action = action;
            }

            // Getter and Setter for sfCheckpointDetails
            public SfCheckpointDetails getSfCheckpointDetails() {
                return sfCheckpointDetails;
            }

            public void setSfCheckpointDetails(SfCheckpointDetails sfCheckpointDetails) {
                this.sfCheckpointDetails = sfCheckpointDetails;
            }

            // Inner class for "sfCheckpointDetails"
            public static class SfCheckpointDetails {

                // Use a valid Java name for the field
                @JsonProperty("360degreecamera")  // Maps to the JSON key
                private FeatureDetails degree360Camera;

                // Getter method for degree360Camera
                public FeatureDetails getDegree360Camera() {
                    return degree360Camera;
                }

                // Setter method for degree360Camera
                public void setDegree360Camera(FeatureDetails degree360Camera) {
                    this.degree360Camera = degree360Camera;
                }

                private FeatureDetails adaptivecruisecontrol;
                private FeatureDetails adaptiveheadlights;
                private FeatureDetails airsuspension;
                private FeatureDetails autoparkassist;
                private FeatureDetails blindspotmonitor;
                private FeatureDetails chargingadapter;
                private FeatureDetails climatecontrolac;
                private FeatureDetails cruisecontrol;
                private FeatureDetails foglightfront;
                private FeatureDetails frontcamera;
                private FeatureDetails headsupdisplay;
                private FeatureDetails memoryseats;
                private FeatureDetails navigation;
                private FeatureDetails parkingsensorsfront;
                private FeatureDetails rearparkingsensor;
                private FeatureDetails rearseatentertainment;
                private FeatureDetails reversecamera;
                private FeatureDetails roofrails;
                private FeatureDetails runninglights;
                private FeatureDetails sidecamera;
                private FeatureDetails rooftype;


                public FeatureDetails getAdaptivecruisecontrol() {
                    return adaptivecruisecontrol;
                }

                public void setAdaptivecruisecontrol(FeatureDetails adaptivecruisecontrol) {
                    this.adaptivecruisecontrol = adaptivecruisecontrol;
                }

                public FeatureDetails getAdaptiveheadlights() {
                    return adaptiveheadlights;
                }

                public void setAdaptiveheadlights(FeatureDetails adaptiveheadlights) {
                    this.adaptiveheadlights = adaptiveheadlights;
                }

                public FeatureDetails getAirsuspension() {
                    return airsuspension;
                }

                public void setAirsuspension(FeatureDetails airsuspension) {
                    this.airsuspension = airsuspension;
                }

                public FeatureDetails getAutoparkassist() {
                    return autoparkassist;
                }

                public void setAutoparkassist(FeatureDetails autoparkassist) {
                    this.autoparkassist = autoparkassist;
                }

                public FeatureDetails getBlindspotmonitor() {
                    return blindspotmonitor;
                }

                public void setBlindspotmonitor(FeatureDetails blindspotmonitor) {
                    this.blindspotmonitor = blindspotmonitor;
                }

                public FeatureDetails getChargingadapter() {
                    return chargingadapter;
                }

                public void setChargingadapter(FeatureDetails chargingadapter) {
                    this.chargingadapter = chargingadapter;
                }

                public FeatureDetails getClimatecontrolac() {
                    return climatecontrolac;
                }

                public void setClimatecontrolac(FeatureDetails climatecontrolac) {
                    this.climatecontrolac = climatecontrolac;
                }

                public FeatureDetails getCruisecontrol() {
                    return cruisecontrol;
                }

                public void setCruisecontrol(FeatureDetails cruisecontrol) {
                    this.cruisecontrol = cruisecontrol;
                }

                public FeatureDetails getFoglightfront() {
                    return foglightfront;
                }

                public void setFoglightfront(FeatureDetails foglightfront) {
                    this.foglightfront = foglightfront;
                }

                public FeatureDetails getFrontcamera() {
                    return frontcamera;
                }

                public void setFrontcamera(FeatureDetails frontcamera) {
                    this.frontcamera = frontcamera;
                }

                public FeatureDetails getHeadsupdisplay() {
                    return headsupdisplay;
                }

                public void setHeadsupdisplay(FeatureDetails headsupdisplay) {
                    this.headsupdisplay = headsupdisplay;
                }

                public FeatureDetails getMemoryseats() {
                    return memoryseats;
                }

                public void setMemoryseats(FeatureDetails memoryseats) {
                    this.memoryseats = memoryseats;
                }

                public FeatureDetails getNavigation() {
                    return navigation;
                }

                public void setNavigation(FeatureDetails navigation) {
                    this.navigation = navigation;
                }

                public FeatureDetails getParkingsensorsfront() {
                    return parkingsensorsfront;
                }

                public void setParkingsensorsfront(FeatureDetails parkingsensorsfront) {
                    this.parkingsensorsfront = parkingsensorsfront;
                }

                public FeatureDetails getRearparkingsensor() {
                    return rearparkingsensor;
                }

                public void setRearparkingsensor(FeatureDetails rearparkingsensor) {
                    this.rearparkingsensor = rearparkingsensor;
                }

                public FeatureDetails getRearseatentertainment() {
                    return rearseatentertainment;
                }

                public void setRearseatentertainment(FeatureDetails rearseatentertainment) {
                    this.rearseatentertainment = rearseatentertainment;
                }

                public FeatureDetails getReversecamera() {
                    return reversecamera;
                }

                public void setReversecamera(FeatureDetails reversecamera) {
                    this.reversecamera = reversecamera;
                }

                public FeatureDetails getRoofrails() {
                    return roofrails;
                }

                public void setRoofrails(FeatureDetails roofrails) {
                    this.roofrails = roofrails;
                }

                public FeatureDetails getRunninglights() {
                    return runninglights;
                }

                public void setRunninglights(FeatureDetails runninglights) {
                    this.runninglights = runninglights;
                }

                public FeatureDetails getSidecamera() {
                    return sidecamera;
                }

                public void setSidecamera(FeatureDetails sidecamera) {
                    this.sidecamera = sidecamera;
                }

                public FeatureDetails getRooftype() {
                    return rooftype;
                }

                public void setRooftype(FeatureDetails rooftype) {
                    this.rooftype = rooftype;
                }
            }

            // Inner class for common feature details like "360degreecamera", "adaptivecruisecontrol", etc.
            public static class FeatureDetails {
                private List<String> values;
                private List<Image> images;
                private String tag;
                private List<String> attachments;
                private Map<String, Object> childFields;
                private String comments;

                // Getter and Setter methods
                public List<String> getValues() {
                    return values;
                }

                public void setValues(List<String> values) {
                    this.values = values;
                }

                public List<Image> getImages() {
                    return images;
                }

                public void setImages(List<Image> images) {
                    this.images = images;
                }

                public String getTag() {
                    return tag;
                }

                public void setTag(String tag) {
                    this.tag = tag;
                }

                public List<String> getAttachments() {
                    return attachments;
                }

                public void setAttachments(List<String> attachments) {
                    this.attachments = attachments;
                }

                public Map<String, Object> getChildFields() {
                    return childFields;
                }

                public void setChildFields(Map<String, Object> childFields) {
                    this.childFields = childFields;
                }

                public String getComments() {
                    return comments;
                }

                public void setComments(String comments) {
                    this.comments = comments;
                }

                // Inner class for Image details
                public static class Image {
                    private boolean loading;
                    private String label;
                    private String path;
                    private boolean updated;

                    // Getter and Setter methods for Image class
                    public boolean isLoading() {
                        return loading;
                    }

                    public void setLoading(boolean loading) {
                        this.loading = loading;
                    }

                    public String getLabel() {
                        return label;
                    }

                    public void setLabel(String label) {
                        this.label = label;
                    }

                    public String getPath() {
                        return path;
                    }

                    public void setPath(String path) {
                        this.path = path;
                    }

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


