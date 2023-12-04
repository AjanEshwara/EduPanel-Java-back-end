package lk.ijse.dep11.edupanel.api;

import lk.ijse.dep11.edupanel.to.request.LecturerRequestTo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/lecturers")
@CrossOrigin
public class LecturerHttpController {
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "multipart/form-data",produces = "application/json")
    public void createNewLecturer(@ModelAttribute @Valid LecturerRequestTo lecturer){
        System.out.println(lecturer);
        System.out.println("create Lecture ");

    }
    @PatchMapping("/{lecturer-id}")
    public void updateLectureDetails(){
        System.out.println("update Lecture ");

    }
    @DeleteMapping("/{lecturer-id}")
    public void deleteLecturers(){
        System.out.println("delete Lecture ");
    }
    @GetMapping
    public void getAllLectures(){
        System.out.println("get Lecture ");

    }
}
