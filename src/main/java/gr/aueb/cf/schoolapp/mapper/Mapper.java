package gr.aueb.cf.schoolapp.mapper;

import gr.aueb.cf.schoolapp.dto.PersonalInfoInsertDTO;
import gr.aueb.cf.schoolapp.dto.TeacherInsertDTO;
import gr.aueb.cf.schoolapp.dto.UserInsertDTO;
import gr.aueb.cf.schoolapp.model.PersonalInfo;
import gr.aueb.cf.schoolapp.model.Teacher;
import gr.aueb.cf.schoolapp.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Mapper {

    // private final PasswordEncoder passwordEncoder;

    public Teacher mapToTeacherEntity(TeacherInsertDTO teacherInsertDTO) {
        Teacher teacher = new Teacher();
        teacher.setActive(teacherInsertDTO.getIsActive());

        User user = new User();
        UserInsertDTO userInsertDTO = teacherInsertDTO.getUser();
        user.setFirstname(userInsertDTO.getFirstname());
        user.setLastname(userInsertDTO.getLastname());
        user.setUsername(userInsertDTO.getUsername());
        user.setPassword(userInsertDTO.getPassword());  // TODO
        user.setFatherName(userInsertDTO.getFatherName());
        user.setMotherName(userInsertDTO.getMotherName());
        user.setFatherLastname(userInsertDTO.getFatherLastname());
        user.setMotherLastname(userInsertDTO.getMotherLastname());
        user.setDateOfBirth(userInsertDTO.getDateOfBirth());
        user.setGender(userInsertDTO.getGender());
        user.setRole(userInsertDTO.getRole());
        user.setIsActive(userInsertDTO.getIsActive());
        teacher.setUser(user);

        PersonalInfoInsertDTO personalInfoInsertDTO = teacherInsertDTO.getPersonalInfo();
        PersonalInfo personalInfo = new PersonalInfo();
        personalInfo.setAmka(personalInfoInsertDTO.getAmka());
        personalInfo.setIdentityNumber(personalInfoInsertDTO.getIdentityNumber());
        personalInfo.setPlaceOfBirth(personalInfoInsertDTO.getPlaceOfBirth());
        personalInfo.setMunicipalityOfRegistration(personalInfoInsertDTO.getMunicipalityOfRegistration());
        teacher.setPersonalInfo(personalInfo);

        return teacher;
    }
}
