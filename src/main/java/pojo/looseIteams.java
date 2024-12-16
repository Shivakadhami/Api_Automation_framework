package pojo;
import java.util.List;

public class looseIteams
{
    public looseIteams()
    {

    }

        private String inspectionType;
        private Data data;

        // Getter and Setter for inspectionType
        public String getInspectionType()
        {
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
            private LooseItems looseItems;

            // Getter and Setter for action
            public String getAction() {
                return action;
            }

            public void setAction(String action) {
                this.action = action;
            }

            // Getter and Setter for looseItems
            public LooseItems getLooseItems() {
                return looseItems;
            }

            public void setLooseItems(LooseItems looseItems) {
                this.looseItems = looseItems;
            }

            // Inner class for "looseItems"
            public static class LooseItems {

                private ItemDetails servicebooklet;
                private ItemDetails servicecontract;
                private ItemDetails floormats;

                // Getter and Setter for servicebooklet
                public ItemDetails getServicebooklet() {
                    return servicebooklet;
                }

                public void setServicebooklet(ItemDetails servicebooklet) {
                    this.servicebooklet = servicebooklet;
                }

                // Getter and Setter for servicecontract
                public ItemDetails getServicecontract() {
                    return servicecontract;
                }

                public void setServicecontract(ItemDetails servicecontract) {
                    this.servicecontract = servicecontract;
                }

                // Getter and Setter for floormats
                public ItemDetails getFloormats() {
                    return floormats;
                }

                public void setFloormats(ItemDetails floormats) {
                    this.floormats = floormats;
                }
            }

            // Inner class for "ItemDetails" (servicebooklet, servicecontract, floormats)
            public static class ItemDetails {

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
            }

            // Inner class for "Image"
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

