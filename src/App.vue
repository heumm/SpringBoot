<template>

  <div class="black-bg" @click="modalIsOpen = false" v-if="modalIsOpen == true">
    <div class="white-bg">
      <h4>상세페이지</h4>
      <p>상세페이지 내용</p>
    </div>
  </div>
  <div class="menu">
    <router-link v-for="a, in menu" :key="a" to="a">{{a}}</router-link>
    <!-- key는 반복문 돌린 요소를 컴퓨터가 구분하기 위해 쓴다. -->
  </div>

  <div v-for="(product,i) in rooms" :key="i">
    <img :src="rooms[i].image" @click="modalIsOpen = true" class="room-img">
    <h4>{{rooms[i].title}}</h4>
    <p>{{rooms[i].price}} 원</p>
    <!-- <button v-on:click="increase(i)">허위매물신고</button> <span>신고수 : {{ accuseCount[i] }}</span> -->
    <!-- v-on:click 또는 @click으로도 가능 --> 
  </div>
</template>



<script>

import roomData from './assets/oneroom.js'

export default {
  name: 'App',
  data(){
    return{  
      //react에서는 state라고도 부른다.
      rooms : roomData,
      modalIsOpen : false,
      // accuseCount : [0, 0, 0],
      menu : ['/home', '/shop', '/about', '/board'],
      /*
      products : [
          {
            roomName : '역삼동원룸',
            image : require('./assets/room0.jpg')
          },
          {
            roomName : '천호동원룸',
            image : require('./assets/room1.jpg')
          },
          {
            roomName : '마포구원룸',
            image : require('./assets/room2.jpg')
          },
        ] 
      */
    }
  },
  /*
  methods: {
    increase(i){
      this.accuseCount[i]++;
    }
  },
  */
  components: {
  }
}
</script>

<style>

body {
  margin: 0;
}

div {
  box-sizing: border-box;
}

.black-bg {
  width: 100%; height: 100%;
  background: rgba(0, 0, 0, 0.5);
  position: fixed; padding: 20px;
}

.white-bg {
  width: 100%; background: white;
  border-radius: 8px;
  padding: 20px;
}

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

.room-img {
  width: 100%;
  margin-top: 40px;
}

.menu {
  background: darkslateblue;
  padding: 15px;
  border-radius: 5px;
}

.menu a {
  color: white;
  padding: 10px;
}

</style>
