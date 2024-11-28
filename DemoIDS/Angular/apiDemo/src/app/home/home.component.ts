import { Component, OnInit } from '@angular/core';
import { ApiService } from '../service/api.service';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-home',
  imports: [CommonModule],
  providers: [
    HttpClientModule
  ],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent implements OnInit{

  data: any[] = [];

  constructor(public apiService: ApiService){ }

  ngOnInit(): void{
    this.llenarData();
  }

//   llenarData(){
// this.apiService.getData().subscribe(data =>  {
// this.data = data;
// console.log(this.data);
// })
// }

llenarData(){
   this.apiService.getData().subscribe((data: any[]) => this.data = data);
   console.log(this.data);
   }

}
