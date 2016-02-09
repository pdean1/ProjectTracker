package projectracker.app.model;

import java.util.GregorianCalendar;

/**
 * Created by Patrick on 2/8/2016.
 * TODO Implement Parcelable constructors
 */
public class Project
{
    private String            sTitle;
    private String            csr_number;
    private GregorianCalendar dDate;
    private GregorianCalendar dStartDate;
    private GregorianCalendar dEndDate;
    private Float             fCompletion;
    private String            sDetails;

    private Project(Builder bob)
    {
        this.createProject(bob);
        if (!this.validProjectData()) {
            throw new IllegalArgumentException("Attempted to create a project with invalid data.");
        }
    }

    /**
     * TODO must create validate project method
     * @return
     */
    private boolean validProjectData() {
        return true;
    }

    public class Builder
    {
        public String            _sTitle;
        public String            _csr_number;
        public GregorianCalendar _dDate;
        public GregorianCalendar _dStartDate;
        public GregorianCalendar _dEndDate;
        public Float             _fCompletion;
        public String            _sDetails;
        public Builder build() {
            return this;
        }
    }

}
