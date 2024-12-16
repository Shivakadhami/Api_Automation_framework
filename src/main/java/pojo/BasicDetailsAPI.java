package pojo;
import java.util.List;
public class BasicDetailsAPI
{

        public BasicDetailsAPI()
        {

        }

        private String inspectionType;
        private Data data;

        // Getters and Setters
        public String getInspectionType()
        {
                return inspectionType;
        }

        public void setInspectionType(String inspectionType) {
                this.inspectionType = inspectionType;
        }

        public Data getData() {
                return data;
        }

        public void setData(Data data) {
                this.data = data;
        }

        public static class Data
        {
                public Data()
                {

                }

                private String action;
                private BasicDetails basicDetails;


                public String getAction() {
                        return action;
                }

                public void setAction(String action) {
                        this.action = action;
                }

                public BasicDetails getBasicDetails() {
                        return basicDetails;
                }

                public void setBasicDetails(BasicDetails basicDetails)
                {
                        this.basicDetails = basicDetails;
                }


        }

        public  static class BasicDetails
        {
                public  BasicDetails()
                {

                }

                private Field make;
                private Field model;
                private Field year;
                private Field variant;
                private Field category;
                private Field bodyType;
                private Field engineSize;
                private Field fuelType;
                private Field noOfCylinders;
                private Field transmissionType;
                private Field odometerReading;
                private Field numberOfDoors;
                private Field batterychargingtime;
                private Field turbochargerSuperchargerAvailable;
                private Field emiratesid;
                private Field drivingrange;
                private Field vin;
                private Field inspectionmode;
                private Field specs;
                private Field noOfKeys; // No need for an empty list, it can be null
                private Field optionsType;
                private Field carExteriorColor;
                private Field noOfAirbags;
                private Field numberOfSeats;
                private Field registrationemirate;
                private Field nationality;
                private Field firstowner;
                private Field carInteriorColor;
                private Field topspeed;
                private Field preparationcost;
                private Field allowauction;
                private Field drive; // Can be null
                private Field spotoffer;
                private Field rtapassingreport;
                private Field taxinvoice;
                private Field loanstatus;
                private Field typeoflead;
                private Field procurementqcrejectionreasonqconly;


                // Getters and Setters for each field
                public Field getMake() {
                        return make;
                }

                public void setMake(Field make) {
                        this.make = make;
                }

                public Field getModel() {
                        return model;
                }

                public void setModel(Field model) {
                        this.model = model;
                }

                public Field getYear() {
                        return year;
                }

                public void setYear(Field year) {
                        this.year = year;
                }

                public Field getVariant() {
                        return variant;
                }

                public void setVariant(Field variant) {
                        this.variant = variant;
                }

                public Field getCategory() {
                        return category;
                }

                public void setCategory(Field category) {
                        this.category = category;
                }

                public Field getBodyType() {
                        return bodyType;
                }

                public void setBodyType(Field bodyType) {
                        this.bodyType = bodyType;
                }

                public Field getEngineSize() {
                        return engineSize;
                }

                public void setEngineSize(Field engineSize) {
                        this.engineSize = engineSize;
                }

                public Field getFuelType() {
                        return fuelType;
                }

                public void setFuelType(Field fuelType) {
                        this.fuelType = fuelType;
                }

                public Field getNoOfCylinders() {
                        return noOfCylinders;
                }

                public void setNoOfCylinders(Field noOfCylinders) {
                        this.noOfCylinders = noOfCylinders;
                }

                public Field getTransmissionType() {
                        return transmissionType;
                }

                public void setTransmissionType(Field transmissionType) {
                        this.transmissionType = transmissionType;
                }

                public Field getOdometerReading() {
                        return odometerReading;
                }

                public void setOdometerReading(Field odometerReading) {
                        this.odometerReading = odometerReading;
                }

                public Field getNumberOfDoors() {
                        return numberOfDoors;
                }

                public void setNumberOfDoors(Field numberOfDoors) {
                        this.numberOfDoors = numberOfDoors;
                }

                public Field getBatterychargingtime() {
                        return batterychargingtime;
                }

                public void setBatterychargingtime(Field batterychargingtime) {
                        this.batterychargingtime = batterychargingtime;
                }

                public Field getTurbochargerSuperchargerAvailable() {
                        return turbochargerSuperchargerAvailable;
                }

                public void setTurbochargerSuperchargerAvailable(Field turbochargerSuperchargerAvailable) {
                        this.turbochargerSuperchargerAvailable = turbochargerSuperchargerAvailable;
                }

                public Field getEmiratesid() {
                        return emiratesid;
                }

                public void setEmiratesid(Field emiratesid) {
                        this.emiratesid = emiratesid;
                }

                public Field getDrivingrange() {
                        return drivingrange;
                }

                public void setDrivingrange(Field drivingrange) {
                        this.drivingrange = drivingrange;
                }

                public Field getVin() {
                        return vin;
                }

                public void setVin(Field vin) {
                        this.vin = vin;
                }

                public Field getInspectionmode() {
                        return inspectionmode;
                }

                public void setInspectionmode(Field inspectionmode) {
                        this.inspectionmode = inspectionmode;
                }

                public Field getSpecs() {
                        return specs;
                }

                public void setSpecs(Field specs) {
                        this.specs = specs;
                }

                public Field getNoOfKeys() {
                        return noOfKeys;
                }

                public void setNoOfKeys(Field noOfKeys) {
                        this.noOfKeys = noOfKeys;
                }

                public Field getOptionsType() {
                        return optionsType;
                }

                public void setOptionsType(Field optionsType) {
                        this.optionsType = optionsType;
                }

                public Field getCarExteriorColor() {
                        return carExteriorColor;
                }

                public void setCarExteriorColor(Field carExteriorColor) {
                        this.carExteriorColor = carExteriorColor;
                }

                public Field getNoOfAirbags() {
                        return noOfAirbags;
                }

                public void setNoOfAirbags(Field noOfAirbags) {
                        this.noOfAirbags = noOfAirbags;
                }

                public Field getNumberOfSeats() {
                        return numberOfSeats;
                }

                public void setNumberOfSeats(Field numberOfSeats) {
                        this.numberOfSeats = numberOfSeats;
                }
                public Field getRegistrationemirate() {
                        return registrationemirate;
                }


                public void setRegistrationemirate(Field registrationemirate) {
                        this.registrationemirate = registrationemirate;
                }

                public Field getNationality() {
                        return nationality;
                }

                public void setNationality(Field nationality) {
                        this.nationality = nationality;
                }

                public Field getFirstowner() {
                        return firstowner;
                }

                public void setFirstowner(Field firstowner) {
                        this.firstowner = firstowner;
                }

                public Field getCarInteriorColor() {
                        return carInteriorColor;
                }

                public void setCarInteriorColor(Field carInteriorColor) {
                        this.carInteriorColor = carInteriorColor;
                }

                public Field getTopspeed() {
                        return topspeed;
                }

                public void setTopspeed(Field topspeed) {
                        this.topspeed = topspeed;
                }

                public Field getPreparationcost() {
                        return preparationcost;
                }

                public void setPreparationcost(Field preparationcost) {
                        this.preparationcost = preparationcost;
                }

                public Field getAllowauction() {
                        return allowauction;
                }

                public void setAllowauction(Field allowauction) {
                        this.allowauction = allowauction;
                }

                public Field getDrive() {
                        return drive;
                }

                public void setDrive(Field drive) {
                        this.drive = drive;
                }

                public Field getSpotoffer() {
                        return spotoffer;
                }

                public void setSpotoffer(Field spotoffer) {
                        this.spotoffer = spotoffer;
                }

                public Field getRtapassingreport() {
                        return rtapassingreport;
                }

                public void setRtapassingreport(Field rtapassingreport) {
                        this.rtapassingreport = rtapassingreport;
                }

                public Field getTaxinvoice() {
                        return taxinvoice;
                }

                public void setTaxinvoice(Field taxinvoice) {
                        this.taxinvoice = taxinvoice;
                }

                public Field getLoanstatus() {
                        return loanstatus;
                }

                public void setLoanstatus(Field loanstatus) {
                        this.loanstatus = loanstatus;
                }



                public Field getTypeoflead()
                {
                        return typeoflead;
                }

                public void setTypeoflead(Field typeoflead) {
                        this.typeoflead = typeoflead;
                }


                public Field getProcurementqcrejectionreasonqconly() {
                        return procurementqcrejectionreasonqconly;
                }


                public void setProcurementqcrejectionreasonqconly(Field procurementqcrejectionreasonqconly) {
                        this.procurementqcrejectionreasonqconly = procurementqcrejectionreasonqconly;
                }
        }

        public static class Field
        {
                public Field()
                {

                }
                private List<String> values;
                private List<Image> images;



                // Getters and Setters
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
        }

        public static class Image
        {
                public Image()
                {

                }
                private String label;
                private String path;
                private boolean updated;



                // Getters and Setters
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


