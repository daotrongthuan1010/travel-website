/**
 * @author ThuanDao
 */
package daothuan.web.com.travelsocial.configuration;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import java.io.Serial;
import java.util.Base64;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Configuration
@RequiredArgsConstructor
public class AwsConfig {

//  private AmazonS3 amazonS3;
//
//  @Value("${aws.region}")
//  private final String awsRegion;
//
//  @Value("${aws.accessKey}")
//  private final String accessKeyEncoded;
//
//  @Value("${aws.secretKey}")
//  private final String secretKeyEncoded;



//  @Bean
//  public BasicAWSCredentials basicAWSCredentials(){
//   String awsAccessKey = new String(Base64.getDecoder().decode(accessKeyEncoded));
//   String awsSecretKey = new String(Base64.getDecoder().decode(secretKeyEncoded));
//    return new BasicAWSCredentials(awsAccessKey, awsSecretKey);
//  }


//  @Bean
//  public AmazonS3 amazonS3() {
//    AmazonS3 amazonS3 = AmazonS3ClientBuilder.standard()
//        .withRegion(Regions.fromName(awsRegion))
//        .withCredentials(new AWSStaticCredentialsProvider(basicAWSCredentials()))
//        .build();
//    return amazonS3;
//  }


//  public void createBucket(String bucketName) {
//    if (!amazonS3.doesBucketExistV2(bucketName)) {
//      amazonS3.createBucket(bucketName);
//    }
//  }

}
