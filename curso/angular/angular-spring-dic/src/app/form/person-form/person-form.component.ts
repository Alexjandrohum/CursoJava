import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-person-form',
  templateUrl: './person-form.component.html',
  styleUrls: ['./person-form.component.css'],
})
export class PersonFormComponent implements OnInit {
  private REST_API_SERVER = 'http://localhost:8080/AngularSpring_dic/api';

  persona = {};
  list:any = [];
  listObject:any [];

  constructor(private httpClient: HttpClient) {}

  ngOnInit(): void {}

  //Invocaion de WS para registro
  add(name, location, phone, $event) {

    console.log(name, location, phone);
    $event.preventDefault();

     var formData = {
      "name": name,
      "location": location,
      "phone": phone,
    };

    var injector = angular.injector(['ng', 'myModule'])

    d = angular.

    let headers = new HttpHeaders().set('Content-Type', 'application/json');

    /*
    this.httpClient
      .post(this.REST_API_SERVER + '/PostFormData', formData, {
        headers: headers
      })
      .subscribe(data => {
        this.list = this.list.concat(JSON.stringify(data));
      });

      */

      this.httpClient.post(this.REST_API_SERVER + "/PostFormDataList", formData, {headers: headers}).subscribe(data =>{
        this.list = data
        this.listObject = this.list.concat(JSON.stringify(data));
      });
  }

  remove(name, $event){

    

    let headers = new HttpHeaders().set('Content-Type', 'application/json');


    this.httpClient.post(this.REST_API_SERVER + "/DeleteFormDataList", name, {headers: headers}).subscribe(data =>{
      this.list = data
    });
  }
}

class Person{

  name: string;
  location: string;
  phone: number;

  

  Person(name, location, phone){
    this.name = name;
    this.location = location;
    this.phone = phone;
  }



}
