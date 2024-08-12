package com.coverletter.Servce;

import java.io.FileWriter;
import java.io.IOException;

import org.springframework.stereotype.Service;

import com.coverletter.Dto.RequestDto;

@Service
public class CoverletterService {
    public String coverLetter(RequestDto requestDto) {
        String coverLetter = generateCoverLetter(requestDto);
        try {
            writeCoverLetterToTextFile(coverLetter, "CoverLetter.txt");
            System.out.println("Cover letter saved as CoverLetter.txt");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        return null;

    }

    private static void writeCoverLetterToTextFile(String coverLetter, String fileName) throws IOException {
        // Write the cover letter to a text file
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(coverLetter);
        }
    }

    private static String generateCoverLetter(RequestDto requestDto) {

        return requestDto.getName() + "\n" +
                requestDto.getAddress() + "\n" +
                requestDto.getZip() + "\n" +
                requestDto.getMailId() + "\n" +
                requestDto.getMobileNumber() + "\n\n" +
                requestDto.getHrName() + "\n" +
                requestDto.getHrTitle() + "\n" +
                requestDto.getCompanyName() + "\n" +
                requestDto.getCompanyAddress() + "\n" +
                requestDto.getCompanyZip() + "\n\n" +
                "Dear " + requestDto.getHrName() + ",\n\n" +

                "I am writing to express my strong interest in the " + requestDto.getJobTitle() + " position at "
                + requestDto.getCompanyName()
                + ". With a passion for coding and a proven track record of delivering high-quality software solutions, I am confident that my skills and experience make me an ideal fit for this role."
                + "\n\n" +

                "In my previous role as a Java Developer at " + requestDto.getCompanyName()
                + ", I successfully developed and implemented complex software applications that streamlined business processes and improved overall efficiency. My expertise in Java programming, along with my strong problem-solving abilities, allowed me to consistently deliver innovative solutions that exceeded client expectations."
                + "\n\n" +

                "What excites me most about the Java Developer position at " + requestDto.getCompanyName()
                + " is the opportunity to work on cutting-edge projects within the luxury retail industry. Your company's commitment to delivering exceptional customer experiences aligns perfectly with my own values and aspirations. I am confident that my technical skills, combined with my passion for creating seamless user experiences, will enable me to contribute significantly to your team."
                + "\n\n" +

                "In addition to my technical expertise, I am a highly collaborative team player who thrives in fast-paced environments. I have a proven ability to effectively communicate complex technical concepts to both technical and non-technical stakeholders, ensuring a shared understanding and successful project outcomes. I am confident that my strong interpersonal skills, coupled with my technical proficiency, will enable me to seamlessly integrate into your team and contribute to its success."
                + "\n\n" +

                "I am excited about the opportunity to join " + requestDto.getCompanyName()
                + " and contribute to its ongoing success. I am confident that my skills, experience, and passion for coding make me an excellent fit for this role. Thank you for considering my application. I look forward to the possibility of discussing how my qualifications align with your needs further."
                + "\n\n" +

                "Sincerely,\n" +
                requestDto.getName();
    }

}
