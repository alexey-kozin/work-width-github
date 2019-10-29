properties([[$class: 'JiraProjectProperty'], parameters([string(defaultValue: 'alexey', description: 'simple parameter', name: 'name', trim: false)]), pipelineTriggers([pollSCM('H/2 * * * *')])])
node{
    
    stage("checkout repo"){
        
        git "https://github.com/alexey-kozin/work-width-github.git"
    }
    stage("hello world"){
        echo("hello world")
            
    }
    
}
