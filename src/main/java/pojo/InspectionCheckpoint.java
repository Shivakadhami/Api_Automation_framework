package pojo;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
public class InspectionCheckpoint
{


    public InspectionCheckpoint()
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
            private Checkpoints checkpoints;

            // Getter and Setter for action
            public String getAction() {
                return action;
            }

            public void setAction(String action) {
                this.action = action;
            }

            // Getter and Setter for checkpoints
            public Checkpoints getCheckpoints() {
                return checkpoints;
            }

            public void setCheckpoints(Checkpoints checkpoints) {
                this.checkpoints = checkpoints;
            }

            // Inner class for "checkpoints"
            public static class Checkpoints
            {

                @JsonProperty("Exterior_Dealer_Images_FrontLeftRightBack")
                private ExteriorDealerImagesFrontLeftRightBack exteriorDealerImagesFrontLeftRightBack;

                // Getter and Setter for exteriorDealerImagesFrontLeftRightBack
                public ExteriorDealerImagesFrontLeftRightBack getExteriorDealerImagesFrontLeftRightBack() {
                    return exteriorDealerImagesFrontLeftRightBack;
                }

                public void setExteriorDealerImagesFrontLeftRightBack(ExteriorDealerImagesFrontLeftRightBack exteriorDealerImagesFrontLeftRightBack) {
                    this.exteriorDealerImagesFrontLeftRightBack = exteriorDealerImagesFrontLeftRightBack;
                }

                // Inner class for "Exterior_Dealer_Images_FrontLeftRightBack"
                public static class ExteriorDealerImagesFrontLeftRightBack {

                    private List<Choice> choices;
                    private List<Object> noImperfectionChoices;
                    private List<RefurbishmentChoice> refurbishmentChoices;
                    private List<Image> images;
                    private List<Object> videos;
                    private List<Object> purchaseConditions;
                    private List<Object> additionalInfo;
                    private boolean ok;
                    private boolean prepopulated;
                    private boolean additional;
                    private boolean skipped;
                    private int revision;
                    private UpdatedBy updatedBy;
                    private String updatedAt;
                    private String refurbSegment;
                    private String maxImperfectionType;

                    // Getter and Setter for choices
                    public List<Choice> getChoices() {
                        return choices;
                    }

                    public void setChoices(List<Choice> choices) {
                        this.choices = choices;
                    }

                    // Getter and Setter for noImperfectionChoices
                    public List<Object> getNoImperfectionChoices() {
                        return noImperfectionChoices;
                    }

                    public void setNoImperfectionChoices(List<Object> noImperfectionChoices) {
                        this.noImperfectionChoices = noImperfectionChoices;
                    }

                    // Getter and Setter for refurbishmentChoices
                    public List<RefurbishmentChoice> getRefurbishmentChoices() {
                        return refurbishmentChoices;
                    }

                    public void setRefurbishmentChoices(List<RefurbishmentChoice> refurbishmentChoices) {
                        this.refurbishmentChoices = refurbishmentChoices;
                    }

                    // Getter and Setter for images
                    public List<Image> getImages() {
                        return images;
                    }

                    public void setImages(List<Image> images) {
                        this.images = images;
                    }

                    // Getter and Setter for videos
                    public List<Object> getVideos() {
                        return videos;
                    }

                    public void setVideos(List<Object> videos) {
                        this.videos = videos;
                    }

                    // Getter and Setter for purchaseConditions
                    public List<Object> getPurchaseConditions() {
                        return purchaseConditions;
                    }

                    public void setPurchaseConditions(List<Object> purchaseConditions) {
                        this.purchaseConditions = purchaseConditions;
                    }

                    // Getter and Setter for additionalInfo
                    public List<Object> getAdditionalInfo() {
                        return additionalInfo;
                    }

                    public void setAdditionalInfo(List<Object> additionalInfo) {
                        this.additionalInfo = additionalInfo;
                    }

                    // Getter and Setter for ok
                    public boolean isOk() {
                        return ok;
                    }

                    public void setOk(boolean ok) {
                        this.ok = ok;
                    }

                    // Getter and Setter for prepopulated
                    public boolean isPrepopulated() {
                        return prepopulated;
                    }

                    public void setPrepopulated(boolean prepopulated) {
                        this.prepopulated = prepopulated;
                    }

                    // Getter and Setter for additional
                    public boolean isAdditional() {
                        return additional;
                    }

                    public void setAdditional(boolean additional) {
                        this.additional = additional;
                    }

                    // Getter and Setter for skipped
                    public boolean isSkipped() {
                        return skipped;
                    }

                    public void setSkipped(boolean skipped) {
                        this.skipped = skipped;
                    }

                    // Getter and Setter for revision
                    public int getRevision() {
                        return revision;
                    }

                    public void setRevision(int revision) {
                        this.revision = revision;
                    }

                    // Getter and Setter for updatedBy
                    public UpdatedBy getUpdatedBy() {
                        return updatedBy;
                    }

                    public void setUpdatedBy(UpdatedBy updatedBy) {
                        this.updatedBy = updatedBy;
                    }

                    // Getter and Setter for updatedAt
                    public String getUpdatedAt() {
                        return updatedAt;
                    }

                    public void setUpdatedAt(String updatedAt) {
                        this.updatedAt = updatedAt;
                    }

                    // Getter and Setter for refurbSegment
                    public String getRefurbSegment() {
                        return refurbSegment;
                    }

                    public void setRefurbSegment(String refurbSegment) {
                        this.refurbSegment = refurbSegment;
                    }

                    // Getter and Setter for maxImperfectionType
                    public String getMaxImperfectionType() {
                        return maxImperfectionType;
                    }

                    public void setMaxImperfectionType(String maxImperfectionType) {
                        this.maxImperfectionType = maxImperfectionType;
                    }

                    // Inner class for "Choice"
                    public static class Choice {

                        private String choice;
                        private Object info;
                        private boolean acceptable;
                        private boolean other;
                        private String tag;
                        private boolean diagnostic;
                        private String imperfectionType;

                        // Getter and Setter for choice
                        public String getChoice() {
                            return choice;
                        }

                        public void setChoice(String choice) {
                            this.choice = choice;
                        }

                        // Getter and Setter for info
                        public Object getInfo() {
                            return info;
                        }

                        public void setInfo(Object info) {
                            this.info = info;
                        }

                        // Getter and Setter for acceptable
                        public boolean isAcceptable() {
                            return acceptable;
                        }

                        public void setAcceptable(boolean acceptable) {
                            this.acceptable = acceptable;
                        }

                        // Getter and Setter for other
                        public boolean isOther() {
                            return other;
                        }

                        public void setOther(boolean other) {
                            this.other = other;
                        }

                        // Getter and Setter for tag
                        public String getTag() {
                            return tag;
                        }

                        public void setTag(String tag) {
                            this.tag = tag;
                        }

                        // Getter and Setter for diagnostic
                        public boolean isDiagnostic() {
                            return diagnostic;
                        }

                        public void setDiagnostic(boolean diagnostic) {
                            this.diagnostic = diagnostic;
                        }

                        // Getter and Setter for imperfectionType
                        public String getImperfectionType() {
                            return imperfectionType;
                        }

                        public void setImperfectionType(String imperfectionType) {
                            this.imperfectionType = imperfectionType;
                        }
                    }

                    // Inner class for "RefurbishmentChoice"
                    public static class RefurbishmentChoice {

                        private String refurbishment;
                        private boolean other;
                        private String tag;

                        // Getter and Setter for refurbishment
                        public String getRefurbishment() {
                            return refurbishment;
                        }

                        public void setRefurbishment(String refurbishment) {
                            this.refurbishment = refurbishment;
                        }

                        // Getter and Setter for other
                        public boolean isOther() {
                            return other;
                        }

                        public void setOther(boolean other) {
                            this.other = other;
                        }

                        // Getter and Setter for tag
                        public String getTag() {
                            return tag;
                        }

                        public void setTag(String tag) {
                            this.tag = tag;
                        }
                    }

                    // Inner class for "Image"
                    public static class Image {

                        private String label;
                        private String path;
                        private String uploadedAt;
                        private boolean updated;

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

                        // Getter and Setter for uploadedAt
                        public String getUploadedAt() {
                            return uploadedAt;
                        }

                        public void setUploadedAt(String uploadedAt) {
                            this.uploadedAt = uploadedAt;
                        }

                        // Getter and Setter for updated
                        public boolean isUpdated() {
                            return updated;
                        }

                        public void setUpdated(boolean updated) {
                            this.updated = updated;
                        }
                    }

                    // Inner class for "UpdatedBy"
                    public static class UpdatedBy {

                        private String uid;
                        private String authType;

                        // Getter and Setter for uid
                        public String getUid() {
                            return uid;
                        }

                        public void setUid(String uid) {
                            this.uid = uid;
                        }

                        // Getter and Setter for authType
                        public String getAuthType() {
                            return authType;
                        }

                        public void setAuthType(String authType) {
                            this.authType = authType;
                        }
                    }
                }
            }
        }
    }


