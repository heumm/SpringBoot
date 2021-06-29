<template>
    <div>
        <h1>Board</h1>
        <table>
            <tr>
                <td>{{test}}</td>
            </tr>

        </table>
    </div>
</template>



<script>


var datas = fetch('https://api.github.com/users/heumm', {
    method: 'get'
}).then(response => response.json())
.then(data => {
    // console.log(data);
    test(data);
    return datas;
})
.catch(function(err) {
    // Error :(
        console.log("error:(")
});

var test = function(param){
    for (var key in param) {
        if(param.hasOwnProperty(key))
        console.log(`${key}: ${param[key]}`);
    }
}
 
export default {
    data() {
        return {
            test: datas
        }
    },
}
</script>

