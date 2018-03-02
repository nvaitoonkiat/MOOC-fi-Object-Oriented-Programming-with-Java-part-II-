/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg16.ski.jumping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author vaitnx
 */
public class Skiier implements Comparable<Skiier>{
    private String name;
    public int total=0;
    private List<Integer> votes = new ArrayList<>();
    private List<Integer> length = new ArrayList<>();

    public Skiier() {
    }
    
    public Skiier(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return (this.name + " (" + this.total +" points)");
    }
    
    public void setLength(List<Integer> length) {
        this.length = length;
    }
    
    public void setVotes(List<Integer> votes) {
        this.votes = votes;
    }

    public int getTotal() {
        return total;
    }

    public String getName() {
        return name;
    }
    
    public List<Integer> getVotes() {
        return votes;
    }

    public List<Integer> getLength() {
        return length;
    }
    public int getLength1(List<Integer> length, int round) {
        return length.get(round-1);
    }
    public void printScore(int round) {
        System.out.println("   " + this.name);
        System.out.println("        length = " +this.getLength1(this.length,round));
        System.out.print("        votes = [" );
        for(int i = 0; i<5; i++){
            if(i==4){
                System.out.println(this.votes.get(i) +"]"); 
            }
            else{
                System.out.print(this.votes.get(i) + ", ");
            }
        }
        findTotal(round);
    }

    public void findTotal(int round) {
        int temp=0;
        for(int i = 0; i<5; i++){
            temp += this.votes.get(i);
        }
        this.total = this.total + this.length.get(round-1) + temp;
    }
    
    public void jump(){
        Random rand = new Random();
        int temp;
        temp= rand.nextInt(120-60) + 60;
            //rand.setSeed(System.currentTimeMillis());
        this.length.add(temp); 
        for(int i = 0; i<5; i++){
            temp = rand.nextInt(20-10) + 10;
            this.votes.add(temp);
        }
    }
    
    @Override
    public int compareTo(Skiier skiier) {
        if(this.total == skiier.total){
            return 0;
        }
        else if (this.total > skiier.total){
            return -1;
        }
        else{
            return 1;
        } 
    }

    
    
}
