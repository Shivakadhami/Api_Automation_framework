package pojo;

public class SubmitInspection
{
     public SubmitInspection()
     {

     }


        private Data data;
        private String inspectionType;

        // Getter and Setter for data
        public Data getData()
        {
            return data;
        }

        public void setData(Data data) {
            this.data = data;
        }

        // Getter and Setter for inspectionType
        public String getInspectionType() {
            return inspectionType;
        }

        public void setInspectionType(String inspectionType) {
            this.inspectionType = inspectionType;
        }

        // Inner class for "data"
        public static class Data
        {

            private String action;

            // Getter and Setter for action
            public String getAction() {
                return action;
            }

            public void setAction(String action) {
                this.action = action;
            }
        }
}



