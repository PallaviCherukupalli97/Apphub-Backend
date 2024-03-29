package csci5308.fall21.appHub.service.university;

import csci5308.fall21.appHub.model.university.UniversityModel;

import java.sql.SQLException;
import java.util.List;

public interface IUniversityService {
    public List<UniversityModel> getAllUniversities() throws SQLException;
    public List<UniversityModel> getUniversity(String user_id) throws SQLException;
}
