package lk.ijse.dep11.edupanel.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/lecturers")
@CrossOrigin
public class LecturerHttpController {
    @PostMapping
    public void createNewLecturer(){
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
